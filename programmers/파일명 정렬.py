import re

def solution(files):
    a = sorted(files, key=lambda file : int(re.findall('[0-9]{1,5}+', file)[0]))
    b = sorted(a, key=lambda file : re.split('[0-9]{1,5}+', file.lower())[0])
    return b