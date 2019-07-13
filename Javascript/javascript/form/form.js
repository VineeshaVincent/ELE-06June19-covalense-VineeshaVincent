window.onload=function(){
};
//     function validateForm(){

//         let myemail=document.forms[0].email.value;
//         console.log(myemail);
    
// }
 function CheckPassword(){
    let myemail=document.forms[0].email.value;
    let mypassword=document.forms[0].mypassword.value;
    let confirmpassword=document.forms[0].confirmpassword.value;
    if(myemail.lenght>6 &&
        mypassword.lenght>6 &&
        confirmpassword.lenght>6 &&
        mypassword===confirmpassword){
            document.getElementsById("mybutton").disabled=true;
        }else{
            console.log("Enter Details Again");
            document.getElementsId("mybutton").disabled=true;
        }
    }
