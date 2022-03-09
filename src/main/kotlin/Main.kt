fun main() {
/*
Crie um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/
    val listaEstoque = mutableListOf<String>()

    while (true){
        println("\n ==== Estoque da Loja ====\n")

        println("1 - Adicionar itens no estoque")
        println("2 - Remover itens do estoque")
        println("3 - Atualizar itens do estoque")
        println("4 - Listar itens no estoque")
        println("5 - Sair")

        println("\n ==== Escolha uma opção ==== \n")
        val opc = readLine()!!.toInt()
        when(opc){
            1 -> {
                print("Qual o item a ser adicionado ao carrinho? ")
                val item = readLine()!!

                if(item.isEmpty()){
                    println("Item inválido")
                }else{
                    listaEstoque.add(item)
                    println("Item adicionado com sucesso!") }
            }
            2 -> {
                print("Qual o item a ser removido do carrinho?")
                val item = readLine()!!

                if(item.isEmpty()){
                    println("Item inválido")
                }else{
                    if(listaEstoque.contains(item)){
                        listaEstoque.remove(item)
                        println("O item $item foi removido com sucesso!")
                    }else{
                        println("O item $item não existe no carrinho.") }
                }
            }
            3 -> {
                print("Selecione um item de 0 a ${listaEstoque.size - 1}")
                val pos = readLine()!!.toInt()

                if(pos in 0..(listaEstoque.size - 1)){
                    print("Qual o produto a ser atualizado?")
                    val item = readLine()!!

                    listaEstoque[pos] = item
                }else{
                    println("Item não existente.") }
            }
            4 -> {
                if(listaEstoque.isEmpty()){
                    println("O carrinho está vazio")
                }else{
                    println(" ==== Carrinho ==== ")

                    listaEstoque.forEach {
                        println(it) }
                }
            }
            else -> break }
    }
}