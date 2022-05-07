package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{

	public List<Produto> findByNomeContainingIgnoreCase(@Param("nome") String nome);

	public List<Produto> buscarProdutosEntre(BigDecimal inicio, BigDecimal fim);

	public List<Produto> findByNomeAndLaboratorio(String nome, String laboratorio);

	public List<Produto> findByPrecoIn(List<BigDecimal> listaPreco);

	public List<Produto> findByNomeOrLaboratorio(String nome, String laboratorio);
}
