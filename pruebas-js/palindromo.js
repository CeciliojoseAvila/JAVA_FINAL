function Palindromo(cadenaTexto) {

  const cadenaLimpia = cadenaTexto.toLowerCase().replace(/ /g, "");

  const cadenaEnReversa = cadenaLimpia.split("").reverse().join("");

  return cadenaLimpia === cadenaEnReversa;
  
}

const texto = "La ruta nos aporto otro paso natural";

if (Palindromo(texto)) {
  console.log(" -----> " + "Es un palíndromo.");
}
