[![Instagram](https://img.shields.io/badge/Instagram-LaCopyDePastel-E4405F?logo=instagram&logoColor=white)](https://instagram.com/LaCopyDePastel)
[![YouTube](https://img.shields.io/badge/YouTube-@rvorine-FF0000?logo=youtube&logoColor=white)](https://youtube.com/@rvorine)

# String Compression

## Problem Statement
Build a program for **String Compression** in multiple languages:
- Java
- Kotlin
- C
- C#
- Python
- JavaScript

A string is compressed by replacing consecutive repeated characters with the character followed by its count.

Example:
- Input: `aabcccccaaa`
- Compressed: `a2b1c5a3`

If compression does not make the string shorter, the original string is returned.

## Solution Approach
All implementations in this repository follow the same logic:
1. Traverse the input string once.
2. Count consecutive repeated characters.
3. Append `character + count` whenever the character changes.
4. Return compressed output only when it is shorter than the original input.

This gives an efficient linear-time solution: **O(n)**.

## Project Structure
- `/java/StringCompression.java`
- `/kotlin/StringCompression.kt`
- `/c/string_compression.c`
- `/csharp/StringCompression.cs`
- `/python/string_compression.py`
- `/javascript/stringCompression.js`

## Quick Run Examples
Use an input like `aabcccccaaa`:

- Java: `javac java/StringCompression.java && java -cp java StringCompression aabcccccaaa`
- Kotlin: `kotlinc kotlin/StringCompression.kt -include-runtime -d kotlin/string-compression.jar && java -jar kotlin/string-compression.jar aabcccccaaa`
- C: `gcc c/string_compression.c -o c/string_compression && ./c/string_compression aabcccccaaa`
- C#: `csc csharp/StringCompression.cs && mono StringCompression.exe aabcccccaaa`
- Python: `python3 python/string_compression.py aabcccccaaa`
- JavaScript: `node javascript/stringCompression.js aabcccccaaa`
