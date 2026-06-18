# Servidor AAA Inspirado em Radius 🛡️

## Visão Geral 📌

Este projeto tem como objetivo desenvolver um back-end em Java simulando um servidor AAA — Authentication, Authorization e Accounting.

Embora o conceito de AAA esteja muito presente no contexto de redes e servidores RADIUS, a proposta deste projeto é aplicar esses conceitos em uma aplicação Java/Spring Boot, com foco em Segurança da Informação, controle de acesso, autenticação segura, autorização por políticas e registro de logs.

O projeto possui caráter educacional e foi desenvolvido para aprofundar conhecimentos em Java, Spring, segurança de aplicações e visão Blue Team. Porém é interessante trazer para a programação para estudar e aplicar conceitos de Criptografia, Autenticação e Logs.

## Objetivo 🎯
O objetivo do sistema é implementar três fluxos principais do AAA:

Authentication: verificar se o usuário pode entrar no sistema.
Authorization: verificar se o usuário possui permissão para acessar determinados recursos ou endpoints.
Accounting: registrar logs das ações realizadas, permitindo rastrear acessos, tentativas de autenticação e eventos relevantes.

## O que é RADIUS 🎯 ?

O RADIUS é um protocolo utilizado em ambientes de rede para centralizar autenticação, autorização e accounting. Ele funciona em um modelo cliente-servidor, sendo comum em cenários como autenticação de usuários em redes corporativas, provedores de internet, VPNs, switches, roteadores e redes Wi-Fi empresariais.

Este projeto não implementa o protocolo RADIUS completo, mas utiliza seus conceitos como base para estudar segurança e desenvolvimento back-end.

## Tecnologias Utilizadas 🧰
1)Java
2)Spring Boot
3)Post-Man
4)MySQL 

## Funcionalidades ⚙️
O sistema será organizado em três módulos principais com a arquitetura cliente-servidor:

Usuário: realiza solicitações de autenticação e acesso aos recursos do sistema.
Administrador: gerencia usuários, políticas de acesso e consulta logs de segurança.
Cliente AAA: representa a aplicação ou serviço que encaminha solicitações de autenticação ao servidor AAA. No contexto de redes, esse papel poderia ser exercido por um roteador, switch, firewall ou controlador de acesso.

## Visão Blue Team 🔵
Na perspectiva Blue Team, o projeto está relacionado ao controle de acesso atrelado fortemente a sua base que é autenticação segura, auditoria e monitoramento de eventos.

O sistema busca simular como uma aplicação pode registrar tentativas de acesso, validar permissões e gerar logs úteis para análise defensiva. Esses registros podem apoiar a identificação de acessos indevidos, falhas de autenticação, tentativas repetidas de login e ações realizadas por usuários dentro do sistema

## Endpoints Principais 🔗 

## Diagrama do Fluxo do Projeto 📊

## Como Executar 🚀

## Aprendizados





## Status do Projeto
