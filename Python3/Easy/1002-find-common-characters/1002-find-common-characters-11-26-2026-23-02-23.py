class Solution:
    def commonChars(self, A):
        return list(reduce(collections.Counter.__and__, map(collections.Counter, A)).elements())