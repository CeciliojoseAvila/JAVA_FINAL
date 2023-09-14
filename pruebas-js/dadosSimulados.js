
const frecuencias = new Array(6).fill(0);

const lanzamientos = 36000;

for (let i = 0; i < lanzamientos; i++) {

  const dado1 = Math.floor(Math.random() * 6) + 1;
  const dado2 = Math.floor(Math.random() * 6) + 1;

  const suma = dado1 + dado2;

  frecuencias[suma - 2]++; 
}

for (let i = 2; i <= 6; i++) {

  console.log(`Suma ${i}: ${frecuencias[i - 2]} veces`);
}