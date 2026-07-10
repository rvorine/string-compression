function compress(input) {
  if (!input) {
    return "";
  }

  const parts = [];
  let count = 1;

  for (let i = 1; i <= input.length; i++) {
    if (i < input.length && input[i] === input[i - 1]) {
      count++;
    } else {
      parts.push(`${input[i - 1]}${count}`);
      count = 1;
    }
  }

  const compressed = parts.join("");
  return compressed.length < input.length ? compressed : input;
}

const sample = process.argv[2] || "aabcccccaaa";
console.log(compress(sample));
