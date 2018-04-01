fun main(args: Array<String>) {
    var score = 79
    if (score >= 90 && score <= 100){
        print("Grade A")
    }else if(score >= 80 && score < 90){
        print("Grade B")
    }else if(score >= 70 && score < 80){
        print("Grade C")
    }else{
        print("Fail")
    }
}