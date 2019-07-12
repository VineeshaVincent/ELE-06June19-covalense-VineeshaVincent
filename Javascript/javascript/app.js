var a=10;
console.log(a);
var b=a;
console.log(b);
b=20;
console.log(a);
console.log(b);
console.log("=============================");

// var person={
//     name:'vini',
//     age:20
// };
// console.log("P Name="+person.name);
// var person1=person;
// console.log("p1 name="+person1.name);
// person1.name='sayooj';
// console.log("p Name"+person.name);
// console.log("P1 Name="+person1.name);


// var person={
//     fname:'vineesha',
//     lname:'vincent',
//     eyecolor:'brown',
//     age:20,
//     getFullName:function(){
//         return this.fname+""+this.lname;
//     },
//     address:{
//         city:'bangaluru',
//         state:'karnataka',
//         pincode:560069
//     },
//     hobbies:['drawing','playing','watching Tv']
// };
// console.log("First Name=  "+person.fname);
// console.log("city=  "+person.address.city);
// console.log("Full Name=  "+person.getFullName());
// console.log("Hobbies=  "+person.hobbies);

// var library=[
//     {
// 		id:1,
// 		author:'sriram',
// 		name:'abc'
//     },
//     {
// 		id:2,
// 		author:'herculies',
// 		name:'race'
//     },{
		
// 		id:3,
// 		author:'vivek',
// 		name:'raksha'
//     }
// ];
// console.log ("object1="+library[0]);
// console.log ("object1="+library[0].name);


var hobbies=['cricket','voliball','football','tennies'];
document.getElementById('demo').innerHTML=hobbies;

// var person={

//     name:'ramya',
//     age:24,
//     city:'bangalore'
// };


// for(var i=0;i<hobbies.length;i++){
//     console.log("Value="+hobbies[i]);
// }

// for(var i=0;i<person.length;i++){
//     console.log("Value="+person[i]);
// }


// console.log("===============================");
// hobbies.forEach((val,index)=>{
//     console.log("value="+val);
//     console.log("index="+index);

// });
// console.log("===============================");
// for(var val of hobbies){
// console.log('hobbies='+val);
// }


// console.log("===============================");
// for(var index in hobbies){
//     console.log("hobbies="+hobbies[index]);
// }

// console.log("===============================");
// for(var index in person){
//     console.log("person="+person[index]);
// }
// console.log("===============================");
// hobbies['test']='some value';
// for(var i in hobbies){
//     console.log("hobbies="+hobbies[i]);
// }
// console.log("============for of==================");
// for(var i of hobbies){
//     console.log("hobbies="+i);
// }

// console.log("=======for of loop started=======");
// console.time("forof");
// for(var i of hobbies){
//     var a=[];

// }
// console.timeEnd("forof");
// console.log("for of ended");


// console.log("=======for in loop started=======");
// console.time("forin");
// for(var i in hobbies){
//     var a=[];

// }
// console.timeEnd("forin");
// console.log("for in ended");


// function alertMessage(val,number){
//     alert(`This is named value=${val} number=${number}`);
// }
// (function(){

//         alert("This is IIFE")
// }());

// (function(){

//     alert("This is IIFE000000")
// })();
//alertMessage("aa",12);

// varkey();
// console.log("======using var=======");
// function varkey(){
//     a=20;
//     console.log("aaaa="+a);
// }
// console.log("aaaa="+a);


// console.log("======using let=======");
// function letkey(){
//     let b=20;
//     console.log(b);
// }
// console.log(b);

// console.log("======using const=======");
// function constkey(){
//     const c=20;
//     console.log(c);
// }
// console.log(c);

// fname();
// function fname(){
//     console.log("aaaa************");
// }


// var fname1=function(){
// console.log("bbbb************")
// }
// fname1();
console.log(typeof hobbies);
console.log(Array.isArray(hobbies));
console.log(Array.isArray(a));


var incl=hobbies.includes("cricket");
console.log(incl);


// console.log("push to last index");
// hobbies.push("kabaddi");
// console.log(hobbies);



// hobbies.pop();
// console.log(hobbies);

// console.log("remove first index");
// hobbies.shift();
// console.log(hobbies);

// hobbies.unshift("add value");
// console.log(hobbies);

//console.log(hobbies);
var hobbies=['cricket','voliball','football','tennies'];
//console.log("modify orginal array");
// hobbies.splice(0,0,"ggg",);
// console.log(hobbies);


// hobbies.slice(0,1);
// console.log(hobbies);

//let hobbies1=hobbies.slice(1);
// console.log(hobbies.join('------'));
// console.log(hobbies);


// console.log(hobbies.indexOf('football'));

//callback function

// function first(sec){
//    setTimeout(()=>{
//     console.log("*********this is fst**************");
//     second();
//    });
   
// }
// function second(){
//     console.log("********** this is secnd***********");
// }
// first(second);

const items=[

    {

        id:1,
        name:'laptop',
        price:67000000
    },
    {

        id:2,
        name:'mobile',
        price:80000
    },
    {

        id:3,
        name:'tab',
        price:15000
    },
    {

        id:4,
        name:'fridge',
        price:18070
    },
    {

        id:5,
        name:'washing machine',
        price:3450000
    }
];
console.log(items);

let mappedIds = items.map((value)=>{
    return value.name;
}
);
console.log(mappedIds);



console.log(items);

let filteredValue = items.filter((value)=>
   // return value.price>4000;
   value.name==='mobile'
);
console.log(filteredValue);


