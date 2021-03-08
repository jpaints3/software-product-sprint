//quick fetch function 
async function strFetch(){
    const gson = new Gson();
    servletText = await (await fetch('/strservlet')).text(); //get the servlet text

    servletJSON = gson.toJSON(servletText) 

    (document.getElementById('strservletText')).innerText = servletText; //input our text into the HTML
}