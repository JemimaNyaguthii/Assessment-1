fun main() {
   var x=names("Njeri","Nyaguthii")
    println(names.index[0])
    var numb=arrayOf(31,30,40,50,60)
    println(numb.max())
    println(numb.min())
    println(numb.average())
    splits()
    joins()
    calculator()




}
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun names(name:String,name1: String){
   return names


//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun numbers():Array<Int>{
    return numbers()


}
//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun splits(){
    var fruit="apple"
//    println(fruit.slice("fruit"))

}
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun joins(){
    var names= arrayOf("cup","plate","mug")
    var counties=arrayOf("Nyeri","Nairobi")
    println((names)+(counties))

}
//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
class Calculator(var num1:Int,var num2:Int,var num3:Int,var num4:Int,var num5:Int,var num6:Int){
    var numbers= arrayOf(10,20,30,40,50,60)
    var sum=(num1+num2)
    println(sum)

    var minus=(num4 -num3)
    println(minus)
    (var division=num6 % num3)
    println(division)



}
