package com.quiz.react.quiz.model

import javax.persistence.*

@Entity
data class VariantSet(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val variant1: String,
        val variant2: String,
        val variant3: String,
        val variant4: String,
        val correct: String
) {
        override fun toString(): String {
                return "VariantSet(id=$id, variant1='$variant1', variant2='$variant2', variant3='$variant3', variant4='$variant4', correct='$correct')"
        }

        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as VariantSet

                if (id != other.id) return false
                if (variant1 != other.variant1) return false
                if (variant2 != other.variant2) return false
                if (variant3 != other.variant3) return false
                if (variant4 != other.variant4) return false
                if (correct != other.correct) return false

                return true
        }

        override fun hashCode(): Int {
                var result = id.hashCode()
                result = 31 * result + variant1.hashCode()
                result = 31 * result + variant2.hashCode()
                result = 31 * result + variant3.hashCode()
                result = 31 * result + variant4.hashCode()
                result = 31 * result + correct.hashCode()
                return result
        }
}