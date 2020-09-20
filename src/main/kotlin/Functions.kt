fun main(){
    val user = setUser("Ari", "Music & Game", 16)
    println(user)
}
fun setUser(name: String, hobby: String, age: Int) = "My name is $name, I like $hobby and im $age years old"