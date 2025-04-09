package com.karamanmert.mypage.blog;

import gg.jte.generated.precompiled.JteindexGenerated;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.stereotype.Component;

@Component
public class ResourceRuntimeHints implements RuntimeHintsRegistrar {
    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        // Register .bin files needed by JTE
        hints.resources()
                .registerPattern("**/*.bin");

        // Register JTE generated classes for reflection
        hints.reflection()
                .registerType(JteindexGenerated.class,
                    MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
                    MemberCategory.INVOKE_DECLARED_METHODS);
    }
}