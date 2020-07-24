module bitcoin.api {
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;

    exports coindesk.exception;
    exports services;
    exports coindesk.model;
    exports coindesk.historical;
    opens coindesk.model;
    exports coindesk;
}