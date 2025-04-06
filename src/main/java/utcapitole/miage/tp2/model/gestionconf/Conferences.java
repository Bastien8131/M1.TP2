package utcapitole.miage.tp2.model.gestionconf;

import java.util.List;

public class Conferences {
    private Long CodCongres;
    private String titreCongres;
    private Integer numEditionCongres;
    private String dtDebutCongres;
    private String dtFinCongres;
    private String urlSiteWebCongres;
    private List<String> thematiques;
    private List<String> activites;

    public Conferences(Long codCongres, String titreCongres, Integer numEditionCongres, String dtDebutCongres, String dtFinCongres, String urlSiteWebCongres, List<String> thematiques, List<String> activites) {
        CodCongres = codCongres;
        this.titreCongres = titreCongres;
        this.numEditionCongres = numEditionCongres;
        this.dtDebutCongres = dtDebutCongres;
        this.dtFinCongres = dtFinCongres;
        this.urlSiteWebCongres = urlSiteWebCongres;
        this.thematiques = thematiques;
        this.activites = activites;
    }

    public Long getCodCongres() {
        return CodCongres;
    }

    public void setCodCongres(Long codCongres) {
        CodCongres = codCongres;
    }

    public String getTitreCongres() {
        return titreCongres;
    }

    public void setTitreCongres(String titreCongres) {
        this.titreCongres = titreCongres;
    }

    public Integer getNumEditionCongres() {
        return numEditionCongres;
    }

    public void setNumEditionCongres(Integer numEditionCongres) {
        this.numEditionCongres = numEditionCongres;
    }

    public String getDtDebutCongres() {
        return dtDebutCongres;
    }

    public void setDtDebutCongres(String dtDebutCongres) {
        this.dtDebutCongres = dtDebutCongres;
    }

    public String getDtFinCongres() {
        return dtFinCongres;
    }

    public void setDtFinCongres(String dtFinCongres) {
        this.dtFinCongres = dtFinCongres;
    }

    public String getUrlSiteWebCongres() {
        return urlSiteWebCongres;
    }

    public void setUrlSiteWebCongres(String urlSiteWebCongres) {
        this.urlSiteWebCongres = urlSiteWebCongres;
    }

    public List<String> getThematiques() {
        return thematiques;
    }

    public void setThematiques(List<String> thematiques) {
        this.thematiques = thematiques;
    }

    public List<String> getActivites() {
        return activites;
    }

    public void setActivites(List<String> activites) {
        this.activites = activites;
    }
}
