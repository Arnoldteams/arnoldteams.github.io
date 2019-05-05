var arr=['1','2','3'];

function f1(a){

    return a-'0';
}

var c=arr.map(f1);

var d=c.reduce(function (x,y) {

    return x*y;
    
})

console.log(c);