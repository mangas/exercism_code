
class Hamming {

    def compute(String s1, String s2) {
        [s1.toCharArray(), s2.toCharArray()]
                .transpose()
                .count {
                    List l -> l[0] != l[1]
                }
    }
}