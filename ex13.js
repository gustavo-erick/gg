for (let i = 1; i <= 100; i++) {
    if (i % 3 === 0 && i % 5 === 0){
        console.log("batata quente");
    }
    else if ( i % 3 === 0){
        console.log("batata");
    }
    else if ( i % 5 === 0){
        console.log("quente");
    }
    else {
        console.log(i)
    }
       
    }
