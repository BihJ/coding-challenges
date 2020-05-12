module.exports = async (payload) =>
  new Promise((resolve) =>
    setTimeout(() => {
      const { state } = payload;
      if (!state) return resolve({ status: "failed" });
      resolve({ status: "ok" });
    }, 1000)
  );
