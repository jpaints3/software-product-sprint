//quick fetch function 
async function strFetch(){
    servletText = await (await fetch('/strservlet')).text();
    (document.getElementById('strservletText')).innerText = servletText;
}