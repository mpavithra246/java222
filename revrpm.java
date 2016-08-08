test = 'ReverseMe VowelsRemoved'
r=test[::-1]
print("Reversed string=")
print r
for eachLetter in r: 
        if eachLetter in ['a','e','i','o','u']:
                r = r.replace(eachLetter, '')
print("String with vowels removed=")
print r