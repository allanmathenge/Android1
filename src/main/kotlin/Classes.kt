class Aeroplane(name: String, var model: String, var color: String, var doors: Int){
    var name = name.trim()

    fun move(){
        println("The aeroplane $name is moving!")
    }
    fun stop(){
        println("The aeroplane $model has stopped!")
    }

}