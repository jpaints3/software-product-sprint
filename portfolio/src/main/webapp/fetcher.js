// quick fetch function 
async function strFetch() {  
  const servletText = await (await fetch('/strServlet')).json(); // get the servlet text as json

  const randomIdx = Math.floor(Math.random() * servletText.length);
  const randomQuote = servletText[randomIdx]; // choose a quote from a random index

  (document.getElementById('strservletText')).innerText = randomQuote; // input our text into the HTML
}