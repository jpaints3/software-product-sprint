//quick fetch function 
async function strFetch(){  
  const servletText = await (await fetch('/strservlet')).json(); //get the servlet text as json

  let randomQuote = ""
  let randomIdx = Math.floor(Math.random() * servletText.length)
  randomQuote = servletText[randomIdx]; //choose a quote from a random index

  (document.getElementById('strservletText')).innerText = randomQuote; //input our text into the HTML
}
