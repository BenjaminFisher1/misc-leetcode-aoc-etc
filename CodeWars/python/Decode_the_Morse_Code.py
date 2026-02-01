from preloaded import MORSE_CODE
import re

def decode_morse(morse_code):
    morseWords = re.split(r"\s{3,}", morse_code.strip())
    words = []
    
    for word in morseWords:
        morse_letters = word.split()
        chars = []
        for morse_letter in morse_letters:
            chars.append(MORSE_CODE[morse_letter])
        words.append(''.join(chars))
    
    return ' '.join(words)