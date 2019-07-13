var library=[
        {
    		id:1,
    		author:'sriram',
    		name:'abc'
        },
        {
    		id:2,
    		author:'herculies',
    		name:'race'
        },{
            
    		id:3,
    		author:'vivek',
    		name:'raksha'
        }
    ];

    var jsonLibrary=JSON.stringify(library);
    console.log(jsonLibrary);

    var objLibrary=JSON.parse(jsonLibrary);
    console.log(objLibrary);
/* 

    let number=prompt("enter number");
    console.log(factorial(number));

     function factorial(n) {
        if(n == 0|| n==1) {
            return 1
        } else {
            return n * factorial(n - 1);
        }
    }
  */

/*     function counter(){
        var counter= 0;
        function getCount(){
            counter++;
            return counter;
        }
        return getCount;
    }
    let count=counter();
    var value=count();
    console.log(value);
    var value1 =count();
    console.log(value1); */

/* 
    var dWeightSalary=(function(){
        var salary=670000;
        function changeBy(amount){
            salary +=amount;
        }
        return{

            raise:function(){
                changeBy(5000);
            },
            lower:function(){
                changeBy(-5000);
            },
            currentAmount:function(){
                return salary;
            }
        };
    })();

    alert(dWeightSalary.currentAmount());
    dWeightSalary.raise();
    alert(dWeightSalary.currentAmount());
    dWeightSalary.lower();
    dWeightSalary.lower();
    alert(dWeightSalary.currentAmount());

    dWeightSalary.changeBy(680000) */


   let promise= new Promise((res,rej)=>{
    const items=[{id:10,name:'viniii'},{id:20,name:'sayu'}];
    if(items.length>0){
        res(items);
    }else{
        rej("rejected");
    }
    });

    promise.then((data)=>{
        console.log(data);
    }).catch((reason)=>{
        console.log(reson);
    });
  

