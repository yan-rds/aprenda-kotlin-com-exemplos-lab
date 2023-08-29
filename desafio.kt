// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome:String)

data class ConteudoEducacional(val nome: String, val horas: Int, val nivel:Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val usuario1 = Usuario("Yan")
    val conteudo1 = ConteudoEducacional("Kotlin", 10, Nivel.INTERMEDIARIO)
    val conteudo2 = ConteudoEducacional("Android", 20, Nivel.DIFICIL)
    val formacao1 = Formacao("Bootcamp Android", listOf(conteudo1, conteudo2))
    
    formacao1.matricular(usuario1)
    
    println(formacao1.inscritos)
    print(formacao1)
}
