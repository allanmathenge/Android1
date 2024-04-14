fun main(args: Array<String>) {
    val instance = Database2.getInstance()
    val instance2 = Database2.getInstance()
    println(instance) // We get the memory location of the instance
    println(instance2) // Return the same instance

}

class Database2 private constructor() {
    companion object {
        
        private var instance: Database2? = null
        fun getInstance(): Database2? {
            if (instance == null) {
                instance = Database2()
            }
            return instance
        }
    }
}