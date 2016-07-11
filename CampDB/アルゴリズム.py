# coding: utf-8

# ソートアルゴリズム: バブルソート
def bubble_sort(sequence):
	i = 0
	while i < (len(sequence) - 1):
		if sequence[i] > sequence[i+1]:
			sequence[i], sequence[i+1] = sequence[i+1], sequence[i]
		i += 1
	return sequence

sample_list = [4, 3, 5, 9, 11, 11]
print bubble_sort(sample_list)


# リニアアルゴリズム
def linear_search(element, array):
	for item in array:
		if item == element:
			return item, element, "Matched!!"
	return "Not matched"		

array = [2,5,6,7,9] 
print linear_search(10, array)
print linear_search(5, array)