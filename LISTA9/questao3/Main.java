public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java Programming", "John Smith", 500, 2020);
        System.out.println(livro1);  // Saída: Livro: Java Programming, Autor: John Smith, Número de Páginas: 500, Ano de Publicação: 2020

        LivroBiblioteca livro2 = new LivroBiblioteca("Clean Code", "Robert Martin", 400, 2008);
        System.out.println(livro2);  // Saída: Livro: Clean Code, Autor: Robert Martin, Número de Páginas: 400, Ano de Publicação: 2008, Disponível: Sim, Data de Devolução:

        LivroLivraria livro3 = new LivroLivraria("Design Patterns", "Gang of Four", 350, 1994, 59.99, 10);
        System.out.println(livro3);  // Saída: Livro: Design Patterns, Autor: Gang of Four, Número de Páginas: 350, Ano de Publicação: 1994, Preço: 59.99, Estoque: 10

        livro2.borrow("2023-06-15");
        System.out.println(livro2);  // Saída: Livro: Clean Code, Autor: Robert Martin, Número de Páginas: 400, Ano de Publicação: 2008, Disponível: Não, Data de Devolução: 2023-06-15

        livro3.sell();  // Saída: Livro vendido: Design Patterns
        System.out.println(livro3);  // Saída: Livro: Design Patterns, Autor: Gang of Four, Número de Páginas: 350, Ano de Publicação: 1994, Preço: 59.99, Estoque: 9

        livro3.sell();  // Saída: Livro vendido: Design Patterns
        livro3.sell();  // Saída: Livro vendido: Design Patterns
        livro3.sell();  // Saída: Livro vendido: Design Patterns
        livro3.sell();  // Saída: Livro vendido: Design Patterns
        livro3.sell();  // Saída: Livro vendido: Design Patterns
        livro3.sell();  // Saída: Livro vendido: Design Patterns
        livro3.sell();  // Saída: Livro vendido: Design Patterns
        livro3.sell();  // Saída: Livro vendido: Design Patterns
        livro3.sell();  // Saída: Livro vendido: Design Patterns
        livro3.sell();  // Saída: Livro fora de estoque: Design Patterns
        System.out.println(livro3);  // Saída: Livro: Design Patterns, Autor: Gang of Four, Número de Páginas: 350, Ano de Publicação: 1994, Preço: 59.99, Estoque: 0
    }
}
