function somaArray(numeros) {
  let soma = 0;

  for (let i = 0; i < numeros.length; i++) {
    soma += numeros[i];
  }

  return soma;
}

console.log(somaArray([1, 2, 3, 4])); 