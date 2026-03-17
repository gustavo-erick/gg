const produtos = [
    {nome: "Moto", preco: 9000},
    {nome: "Residencia", preco: 120000},
    {nome: "Faculdade", preco: 5500},
    {nome: "Calopsita", preco: 200},
];

let maisCaro = produtos[0];

for (let i = 1; i < produtos.length; i++) {
    if (produtos[i].preco > maisCaro.preco) {
        maisCaro = produtos[1];
    }
}
console.log("produto mais caro:", maisCaro.nome);