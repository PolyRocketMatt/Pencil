package com.github.polyrocket.pencil.engine.services;

import com.github.polyrocket.pencil.engine.Pencil;
import com.github.polyrocket.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocket.pencil.engine.exception.PencilException;
import com.github.polyrocket.pencil.engine.utils.ExceptionReport;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * Created by PolyRocketMatt on 01/07/2020.
 */

public class LanguageService extends Service {

    public enum ServerLanguage {
        ENGLISH("en"),
        DUTCH("nl"),
        GERMAN("ge"),
        FRENCH("fr");

        private String locale;

        ServerLanguage(String locale) {
            this.locale = locale;
        }

        public String getLocale() {
            return locale;
        }
    }

    private ServerLanguage language;

    public LanguageService() {
        super(4);

        this.language = ServerLanguage.ENGLISH;
    }

    @Override
    public int start() {
        return 0;
    }

    @Override
    public int stop() {
        return 0;
    }

    @Override
    public String dump() {
        return "LanguageService{}";
    }

    public String translate(String text) {
        try {
            if (language != ServerLanguage.ENGLISH) {
                String stringURL = DefaultStrings.LANGUAGE_URL
                        + "?q=" + URLEncoder.encode(text, StandardCharsets.UTF_8)
                        + "&target=" + language.getLocale()
                        + "&source=en";
                URL url = new URL(stringURL);
                StringBuilder response = new StringBuilder();
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setRequestProperty("User-Agent", "Mozilla/5.0");

                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;

                while ((inputLine = in.readLine()) != null)
                    response.append(inputLine);

                in.close();

                return response.toString();
            }

            return text;
        } catch (Exception ex) {
            Pencil.getExceptionService().catchException(new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.LOW,
                    DefaultStrings.CONSOLE_PREFIX + "Exception occurred during translation of '" + text + "'"
            ));

            return text;
        }
    }
}
