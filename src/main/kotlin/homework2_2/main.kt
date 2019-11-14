package homework2_2

fun main() {

    val text = TextView("Some Text")
    text.click() // вызывается метод из `View`
    println(text.text) // Some Text
    text.text = "Something bad happened"
    println(text.text) // Something bad happened

    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)

    val button = Button("Click me")
    button.click() // вызывается метод из `View`
    println(button.text) // Click me
    button.text = "Don't click me"
    println(button.text) // Don't click me

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)
    println(readMore.text)
}