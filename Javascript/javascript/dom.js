/* let name =document.getElementById('name');
console.log(name);
console.log(name.textContent);
name.style.color="green";

var classCollection=document.getElementsByClassName('demo');
console.log(classCollection);
classCollection[0].style.fontSize="100px";

classCollection[1].style.display='none'; */


//document.getElementById('mybutton').className='button';
// document.getElementById('mybutton').classList='button button1';

// var querySelect = document.querySelectorAll('.demo');
// console.log(querySelect);

// let input = document.createElement('input');
// document.body.appendChild(input);

/* var demoClass=document.getElementsByClassName('demo');
console.log(" by class name"+demoClass.length); */

// var demoClass1=document.querySelectorAll('.demo');
// console.log("query selector"+demoClass1.lenght);

//write the number of elements in each array(value match)
/* console.log("number of elements with queryselectorAll="+demoClass1.length);
console.log("number of elements with getElementsByClassName ="+demoClass.length); */

//change one elements class to"blue"
// document.getElementById("pele").className="blue";

//write the number of elements in each array(value differ)
/* console.log("number of elements with queryselectorAll="+demoClass1.length);
console.log("number of elements with getElementsByClassName ="+demoClass.length);

document.write("<h1>Viniiiiiiii</h1>");
 */

let button=document.getElementById('mybutton');
/* button.onclick=function createnewElement(){


    document.getElementById('div1').innerHTML='<a href="http://www.vineesha.com">Anchor tag</a>';
 } */

 window.onload=function(){
     document.getElementById('mybutton').textContent='Dont click';
 };

 
 button.addEventListener('click',()=>{
 document.getElementById('div1').innerHTML='<a href="http://www.google.com">Anchor tag</a>';

});


