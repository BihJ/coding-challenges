const http = require("http");
const { port, hostname } = require("./config");

const requestData = JSON.stringify({
  state: true
});

const callHook = async (hookName) =>
  new Promise((resolve, reject) => {
    const options = {
      hostname: hostname,
      port: port,
      path: "/",
      method: "POST",
      headers: {
        "Content-Type": "application/json",
        "Content-Length": requestData.length,
        "Hook-Name": hookName,
      },
    };

    const req = http.request(options, (res) => {
      resolve(res.statusCode);
    });

    req.on("error", (error) => {
      reject(error);
    });

    req.write(requestData);
    req.end();
  });

const assertStatusCodeForHook = async (hookName, assertedStatusCode) => {
  const assertedStateText = assertedStatusCode >= 400 ? "fail" : "succeed";
  console.log(`Assert hook "${hookName}" to ${assertedStateText}.`);
  try {
    const responseStatusCode = await callHook(hookName);
    if (responseStatusCode !== assertedStatusCode)
      console.log(
        `Failed: Hook "${hookName}" should return http status code of ${assertedStatusCode}`
      );
    else console.log(`Success: Hook returned status code of ${responseStatusCode}.`);
  } catch (error) {
    console.log(`Error: Request to hook "${hookName}" failed.`);
    throw(error)
  }
};

const testHooks = async () => {
  console.log("Test hooks...");
  console.log("");
  await assertStatusCodeForHook("pre-create", 500);
  console.log("");
  await assertStatusCodeForHook("post-create", 200);
  console.log("");
  await assertStatusCodeForHook("post-finish", 200);
  console.log("");
  await assertStatusCodeForHook("post-terminate", 200);
  console.log("");
  await assertStatusCodeForHook("post-receive", 500);
  console.log("");
  await assertStatusCodeForHook("not-existing-hook", 400);
};

module.exports = testHooks;
