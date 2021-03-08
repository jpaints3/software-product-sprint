//quick fetch function 
async function strFetch(){
    const gson = new Gson();
    const servletText = (await fetch('/strservlet')).text(); //get the servlet text

    const servletJSON = gson.toJSON(servletText) 

    (document.getElementById('strservletText')).innerText = servletText; //input our text into the HTML
}