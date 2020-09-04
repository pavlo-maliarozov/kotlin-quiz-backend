package com.quiz.react.quiz.model

import javax.persistence.*

@Entity
data class Question(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val questionText: String,
        @OneToOne(cascade = [CascadeType.ALL])
        @JoinColumn(name = "variant_set_id")
        val variantSet: VariantSet
) {
        override fun toString(): String {
                return "Question(id=$id, questionText='$questionText', variantSet=${variantSet.id})"
        }

        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as Question

                if (id != other.id) return false
                if (questionText != other.questionText) return false
                if (variantSet != other.variantSet) return false

                return true
        }

        override fun hashCode(): Int {
                var result = id.hashCode()
                result = 31 * result + questionText.hashCode()
                result = 31 * result + variantSet.hashCode()
                return result
        }
}