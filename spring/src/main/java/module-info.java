module spring {
    exports esgi.spring;

    requires spring.context;
    requires services;
    requires esgi.controller;
    requires com.fasterxml.jackson.databind;
    requires spring.beans;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires slalom.example.db.hazelcast;
    requires esgi.encoder;
    requires esgi.uuid;
}