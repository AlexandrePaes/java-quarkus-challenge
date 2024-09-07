package domain;

import org.inferred.freebuilder.FreeBuilder;

import java.util.Optional;
import java.util.Set;

@FreeBuilder
public interface CandidateQuery {
    Optional<Set<String>> ids();
    Optional<String> name();

    class Builder extends CandidateQuery_Builder {

        CandidateQuery build() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'build'");
        }

        Builder ids(Set<String> of) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'ids'");
        }

        public Builder name(String string) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'name'");
        }}
}
