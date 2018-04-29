fun main(args: Array<String>) {

    var a=0

    while(a<10){

        println("$a before inc")
        a++
        if (a>=2&&a<7){  // 0,1,2,3,4
            continue
        }
        println("$a after inc")
    }

    var b=0
    while (b<10){
        println("$b before inc")
        b++
        if(b==4){
            break
        }

        println("$b after inc")
    }
}