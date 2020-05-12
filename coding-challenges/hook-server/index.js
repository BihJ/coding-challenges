const hookServer = require("./server.solution");
const exampleSuccessfulHook = require("./hooks/example-successful-hook");
const exampleFailingHook = require("./hooks/example-failing-hook");
const exampleErrorInHook = require("./hooks/example-error-in-hook");

const { port, hostname } = require("./config");

hookServer.on("post-finish", exampleSuccessfulHook);
hookServer.on("pre-create", exampleSuccessfulHook);
hookServer.on("pre-create", exampleFailingHook);
hookServer.on("post-receive", exampleErrorInHook);

console.log("Starting hook server...");
hookServer.listen(port, hostname);
console.log("Hook server started.");
