import sys

if __name__ == "__main__":
	rows = 3
	reverse = False

	for arg in sys.argv[1:]:
		if arg.isdigit():
			rows = int(arg)
		elif arg == "-i":
			reverse = True

	for i in reversed(range(rows)) if reverse else range(rows):
		print("{0}{1}{0}".format(" "*(rows-i-1), "T"*(2*i+1)))
