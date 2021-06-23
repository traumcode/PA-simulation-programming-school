package com.pasimulation;

public enum Module {
    BASIC(Language.PYTHON) {
        @Override
        public Module getNextModule() {
            return WEB;
        }
    },
    WEB(Language.WEB) {
        @Override
        public Module getNextModule() {
            return OOP;
        }
    },
    OOP(Language.JAVA_SE) {
        @Override
        public Module getNextModule() {
            return ADVANCED;
        }
    },
    ADVANCED(Language.JAVA_EE) {
        @Override
        public Module getNextModule() {
            return null;
        }
    };

    public final Language language;

    Module(Language language) {
        this.language = language;
    }

    public abstract Module getNextModule();
}
