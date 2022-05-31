#4)Write a Python Program or Multiclipboard to save each piece of clip of text under keyboard.
import os
def addToClipBoard(text):
    command = 'echo ' + text.strip() + '| clip'
    os.system(command) 
print('Added to clipboard')
addToClipBoard('Iam handsome!')