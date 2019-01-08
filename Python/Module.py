import random
a = 1
b = 3
names = [ "nan", "vino"]

def get_file_ext(filename):
    return filename[filename.index(".") + 1:]

def roll_dice(num):
    return random.randint(1, num)
