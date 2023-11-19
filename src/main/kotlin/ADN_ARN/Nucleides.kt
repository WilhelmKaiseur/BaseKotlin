package ADN_ARN

enum class Nucleides( val s: String) {
    A("Adenine"){
        override fun complement(): Nucleides {
            return U
        }

        override fun toString(): String {
            return A.s
        }
    },
    G("Guanine"){
        override fun complement(): Nucleides {
            return C
        }

        override fun toString(): String {
            return G.s
        }
    },
    C("Cytosine"){
        override fun complement(): Nucleides {
            return G
        }

        override fun toString(): String {
            return C.s
        }
    },
    U("Uracile"){
        override fun complement(): Nucleides {
            return A
        }

        override fun toString(): String {
            return U.s
        }
    };

    abstract fun complement(): Nucleides
}