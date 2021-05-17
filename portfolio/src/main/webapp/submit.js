//fetch function for submission servlet
async function submissionFetch() {
  const completionMessage = await fetch("/submitform");

  document.getElementById("postComplete").innerText = completionMessage;
}
