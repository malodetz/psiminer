package psi.graphs

import com.intellij.psi.PsiElement

enum class EdgeType {
    Ast,
    NextToken,
    DeclarationUsage,
    ControlFlow,
    NextLexicalUse
}

data class Edge(val from: PsiElement, val to: PsiElement, val type: EdgeType, val reversed: Boolean = false) {
    fun reversed(): Edge = Edge(to, from, type, !reversed)
}
