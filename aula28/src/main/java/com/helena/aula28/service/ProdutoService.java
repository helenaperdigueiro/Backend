package com.helena.aula28.service;

import com.helena.aula28.persistence.entities.ProdutoEntity;
import com.helena.aula28.persistence.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoEntity> buscarTodos() {
        return produtoRepository.findAll();
    }
    public ProdutoEntity salvar(ProdutoEntity produtoEntity) {
        return produtoRepository.save(produtoEntity);
    }
    public void deletar(Integer id) {
        produtoRepository.deleteById(id);
    }
    public ProdutoEntity subtrair(Integer id, Integer quantidade) {
        ProdutoEntity produto = produtoRepository.findById(id).get();
        produto.setQuantidade(produto.getQuantidade()-quantidade);
        produtoRepository.save(produto);
        return produtoRepository.findById(id).get();
    }
}

