# Hook server

> In computer programming, the term hooking covers a range of techniques used to alter or augment the behavior of an operating system, of applications, or of other software components by intercepting function calls or messages or events passed between software components. Code that handles such intercepted function calls, events, or messages is called a hook.

Some server `X` sends you a post request with a custom header `Hook-Name: [name]` which contains information about a hook to be called. Your task is to write an HTTP server in file `server.js` that registers hooks (as you can see in 'index.js') and executes these when a post request with the correct header information was received.

Hooks receive a payload from `X` and return a status which is either "ok" or "failed". Hooks can also throw exceptions. For all test cases, your server needs to cover have a look at `test-hook-server.js`. Also, have a look at the hooks in `hooks/`.

## Steps

1. Install the dependencies with `npm install`
2. Write your server code in `server.js`
3. Start your server with `npm run start`
4. Test your server with `npm run test`

## Hints

We recommend using [Express](https://expressjs.com/) as the base HTTP server.

If you have any questions feel free to contact Leonard Puhl.
