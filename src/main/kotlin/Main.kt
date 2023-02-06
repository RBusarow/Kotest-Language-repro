fun main() = printKotlin("")

fun printKotlin(
  @org.intellij.lang.annotations.Language("kotlin")
  content: String
) {
  println(content.trimIndent())
}
